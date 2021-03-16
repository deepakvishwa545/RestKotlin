package com.codeTcsKot.codeTcsKot.Service

import com.codeTcsKot.codeTcsKot.Model.Formdata

class AmountCal {

    val appleAmount =60
    val orangeAmount =65
    var appleTotal : Double=0.0
    var orangeTotal : Double=0.0
    var appleQuantity : Int=0
    var orangeQuantity : Int=0
    var totalBillAmount : Double=0.0
    var totalInDollor : String =""

    fun cal(data : Formdata) : String
    {
       appleQuantity= (data.quantityApple).toInt()
        orangeQuantity=(data.quantityOrange).toInt()

        if (data.appleOffer)
        {
            if (appleQuantity%2==0)
            {
                appleTotal=((appleQuantity/2)*appleAmount).toDouble()

            }
            else
            {
                appleQuantity-=1
                appleTotal=(((appleQuantity/2)*appleAmount)+appleAmount).toDouble()
            }
        }
        else
        {
            appleTotal=(appleQuantity*appleAmount).toDouble()
        }
        if (data.orangeOffer)
        {
            var c:Int=0

            for(b in 1..10)
            {
                if (orangeQuantity%3==0)
                {
                    break
                }
                orangeQuantity--
                c=b
            }
            println(orangeQuantity)
            println(c)
            orangeTotal=(c*orangeAmount+(((orangeQuantity/3)*orangeAmount))*2).toDouble()
            println(orangeTotal)

            //orangeTotal=orangeQuantity*orangeAmount-(((orangeQuantity*orangeAmount)*33.333)/100)
        }
        else
        {
            orangeTotal=(orangeQuantity*orangeAmount).toDouble()
        }

        totalBillAmount=((appleTotal+orangeTotal)/100)
        totalInDollor=totalBillAmount.toString()
       totalInDollor="$"+totalInDollor

        return totalInDollor

    }






}