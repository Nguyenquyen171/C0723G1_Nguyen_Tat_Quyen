package com.example.exercise.controller;

import com.example.exercise.model.Product;
import com.example.exercise.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping()
    public ModelAndView showList() {
        List<Product> productList = productService.showList();
        return new ModelAndView("list", "productList", productList);
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        return new ModelAndView("create", "product", new Product());
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        productService.create(product);
        redirectAttributes.addFlashAttribute("product", "Successfully added new product!");
        return "redirect:/";
    }

    @GetMapping("/view/{id}")
    public ModelAndView showDetail(@PathVariable int id) {
        return new ModelAndView("view", "product", productService.findById(id));
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Product product) {
        productService.create(product);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        productService.remove(id);
        return "redirect:/";
    }

    @GetMapping("/search_by_name")
    public ModelAndView search(@RequestParam("searchByName") String searchByName) {
        List<Product> productList = productService.searchByName(searchByName);
        return new ModelAndView("list", "productList", productList);
    }


}
