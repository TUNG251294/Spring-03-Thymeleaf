package com.example.controller;

import com.example.model.Product;
import com.example.service.IProductService;
import com.example.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/home")
public class ProductController {
    private final IProductService productService = ProductService.getProductService();
    @GetMapping("/home")
    public String homeForm(Model model){
        List<Product> products = productService.findAll();
        model.addAttribute("products",products);
        return "list";
    }
    @GetMapping("/create")
    public String createForm(Model model){
        model.addAttribute("product", new Product());
        return "save";
    }
    @PostMapping("/save")
    public String save(Model model, Product product){
        productService.save(product);
        return "redirect:/home";
    }
    @GetMapping("/update/{id}")
    public String updateForm(@PathVariable int id,Model model){
        Product product = productService.findById(id);

        model.addAttribute("products",product);
        return "edit";
    }
    @PostMapping("/update")
    public String update(Product product){
        productService.edit(product);
        return "redirect:/home";
    }


}
