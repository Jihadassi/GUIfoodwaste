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


    /* Mangler html sider for:

     */

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
        return "confirmation";
    }


    @GetMapping("/about-us")
    public String aboutUsPage(){
        return "OmKonceptet";
    }
    @GetMapping("/limited-donations")
    public String limitedDonationPage(){
        return "restrictedPosts";
    }

    @GetMapping("/unlimited-donations")
    public String unlimitedDonationPage(){
        return "activePosts";
    }






/*

Skal de 3 entities have forskellige muligheder når de er logget ind? (flere PostMappings)



Skal tilføjes til privateUser.html, companyUser.html og organizationUser.html
Så når man bekræfter linker det videre.

Desuden skal alle 3 have mulighed for at gå tilbage til forsiden?

    @PostMapping("/created-private-user")
    public String createdPrivateUserPage(){
        return "homepage2";
    }

    @PostMapping("/created-company-user")
    public String createdCompanyUserPage(){
    return "homepage2";
    }


    @PostMapping("/created-organization-user")
    public String createdOrganizationUserPage(){
    return "homepage2";
    }

    Mangler:

    @GetMapping("/about-us")
    public String aboutUsPage(){
    return "aboutUs";
    }

    @GetMapping("/about-food-waste")
    public String aboutFoodWastePage(){
    return "aboutFoodWaste";
    }

    @GetMapping("/limited-donations")
    public String limitedDonationPage(){
    return "limitedDonations";
    }

    @GetMapping("/unlimited-donations")
    public String unlimitedDonationPage(){
    return "unlimitedDonations";
    }



    @GetMapping("/confirmation")
    public String confirmationPage(){
    return "confirmation";
    }





*/

}
