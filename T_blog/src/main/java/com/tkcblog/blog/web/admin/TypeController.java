package com.tkcblog.blog.web.admin;


import com.tkcblog.blog.po.Type;
import com.tkcblog.blog.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/admin")
public class TypeController {

    //自动注入
    @Autowired
    private TypeService typeService;

    //返回分类管理页面
    @GetMapping("/types")
    public String types(@PageableDefault(size=4,sort={"id"},direction = Sort.Direction.DESC) Pageable pageable, Model model){

        model.addAttribute("page",typeService.listType(pageable));

        return "admin/types";
    }

    //返回分类编辑页面
    @GetMapping("/types/input")
    public String input(Model model){
        model.addAttribute("type",new Type());
        return "admin/types-input";
    }

    //返回分类新增页面
    @GetMapping("/types/{id}/input")
    public String editInput(@PathVariable Long id, Model model){
        model.addAttribute("type",typeService.getType(id));
        return "admin/types-input";
    }

    //分类的新增校验
    @PostMapping("/types")
    public String post(Type type,BindingResult result,RedirectAttributes attributes){

        Type type1 = typeService.getTypeByname(type.getName());
        if(type1 != null){
            result.rejectValue("name","nameError","不能重复添加分类");
        }
        if(result.hasErrors()){
            return "admin/types-input";
        }

        Type t = typeService.saveType(type);
        if(t==null){
          attributes.addFlashAttribute("message","新增失败");
        }else{
          attributes.addFlashAttribute("message","新增成功");
        }
        return "redirect:/admin/types";

    }

    //分类的更新校验
    @PostMapping("/types/{id}")
    public String editpost(Type type,BindingResult result,@PathVariable Long id,RedirectAttributes attributes){

        Type type1 = typeService.getTypeByname(type.getName());
        if(type1 != null){
            result.rejectValue("name","nameError","不能重复添加分类");
        }
        if(result.hasErrors()){
            return "admin/types-input";
        }

        Type t = typeService.updateType(id,type);
        if(t==null){
            attributes.addFlashAttribute("message","更新失败");
        }else{
            attributes.addFlashAttribute("message","更新成功");
        }
        return "redirect:/admin/types";

    }

   //分类的删除校验
    @GetMapping("/types/{id}/delete")
    public String delete(@PathVariable Long id,RedirectAttributes attributes){
        typeService.deleteType(id);
        attributes.addFlashAttribute("message","删除成功");
        return "redirect:/admin/types";

    }

}
