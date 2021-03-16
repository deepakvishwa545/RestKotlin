package com.codeTcsKot.codeTcsKot.Controller

import com.codeTcsKot.codeTcsKot.Model.Formdata
import com.codeTcsKot.codeTcsKot.Service.AmountCal
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping

@Controller
class MainController {


      val amountCal=AmountCal()

@GetMapping("/")
    fun deshboard(model: Model): String
    {
        val data= Formdata()
        model.addAttribute("data",data)

        return "newHomepage"

    }
    @PostMapping("/order")
    fun order(@ModelAttribute("data") data: Formdata,model: Model) : String
    {

        model.addAttribute("orderDetails",data)
        var totalAmount=amountCal.cal(data)
        model.addAttribute("tAmmount",totalAmount)


        return "newbill"
    }
    @GetMapping("/orderConfirm")
    fun orderConfirm(model: Model) : String
    {
        var mszString1 : String="Order has been placed Successfully"
        var mszString2 : String="Your order will delever soon..!!"

        model.addAttribute("mszString1",mszString1)
        model.addAttribute("mszString2",mszString2)
        println(mszString1)
         return "finalPage"
    }


}