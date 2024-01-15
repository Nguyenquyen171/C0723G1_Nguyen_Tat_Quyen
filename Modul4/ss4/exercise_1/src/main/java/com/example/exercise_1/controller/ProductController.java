package com.example.exercise_1.controller;

import com.example.exercise_1.model.Product;
import com.example.exercise_1.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RequestMapping
@Controller
public class ProductController {
    @Autowired
    private IProductService productService;
    @GetMapping()
    public ModelAndView showList(){
        List<Product> productList= productService.showList();
        return new ModelAndView("list","productList",productList);
    }
    @GetMapping("/create")
    public ModelAndView showCreateForm(){
        return new ModelAndView("create", "product",new Product());
    }
    @PostMapping("/create")
    public String createProduct(@ModelAttribute Product product, RedirectAttributes redirectAttributes){
        productService.create(product);
        redirectAttributes.addFlashAttribute("product","Thêm mới thành công");
        return "redirect:/";
    }
    @GetMapping("/view/{id}")
    public ModelAndView showDetail(@PathVariable Integer id) {
        return new ModelAndView("view", "product", productService.findById(id));
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Product product) {
        productService.update(product.getId(), product);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        productService.remove(id);
        return "redirect:/";
    }

    @GetMapping("/search_by_name")
    public ModelAndView search(@RequestParam String searchByName) {
        List<Product> productList = productService.searchByName(searchByName);
        return new ModelAndView("search", "productList", productList);
    }

}
