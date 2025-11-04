package com.example.guifoodwaste.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage(){
        return "homepage1";
    }

    @GetMapping("/reg-user")
    public String createUserPage(){
        return "createUser";
    }

   @GetMapping("/reg-user/private")
    public String createsPrivateUserPage(){
        return "privateUser";
    }

    @GetMapping("/reg-user/company")
    public String createsCompanyUserPage(){
        return "companyUser";
    }

    @GetMapping("/reg-user/organization")
    public String createsOrganizationUserPage(){
        return "organizationUser";
    }

    @GetMapping("/login")
    public String logInPage(){
        return "logIn";
    }


    @GetMapping("/home")
    public String homepage2(){
        return "homepage2";
    }

    @GetMapping("/logout")
    public String redirectToHomepageOne() {
        return "redirect:/";
    }

    @PostMapping("/created-user")
    public String createdUser() {
        return "homepage2";

    }

    /* LOG IN / CREATE USER - CONTROLLER */
    @PostMapping("/log-in")
    public String loginForm(@RequestParam String username, Model model) {
        model.addAttribute("username", username);
        return "homepage2";
    }

    @PostMapping("/log-in-companyUser")
    public String createCompanyUserForm(@RequestParam String username, Model model) {
        model.addAttribute("username", username);
        return "homepage2";
    }

    @PostMapping("/log-in-organizationUser")
    public String createOrganizationUserForm(@RequestParam String username, Model model) {
        model.addAttribute("username", username);
        return "homepage2";
    }

    @PostMapping("/log-in-privateUser")
    public String createPrivateUserForm(@RequestParam String username, Model model) {
        model.addAttribute("username", username);
        return "homepage2";
    }


    @GetMapping("/reg-donation")
    public String createDonationPage(){
        return "createDonation";
    }

    @PostMapping("/reg-donation")
    public String createdDonationPage(){
        return "confirmPage";
    }

    @GetMapping("/confirmation")
    public String confirmationPage(){
        return "confirmPage";
    }




    @GetMapping("/about-us")
    public String aboutUsPage(){
        return "concept";
    }
    @GetMapping("/limited-donations")
    public String limitedDonationPage(){
        return "restrictedPosts";
    }

    @GetMapping("/unlimited-donations")
    public String unlimitedDonationPage(){
        return "activePosts";
    }

    @GetMapping("/about-food-waste")
    public String aboutFoodWastePage(){
        return "OmMadspild";
    }

}
