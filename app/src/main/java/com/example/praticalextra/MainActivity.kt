package com.example.praticalextra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener() {
            val carprice:Double = editTextCarPrice.text.toString().toDouble()
            val downpayment:Double =editTextDownPayment.text.toString().toDouble()

            val loan:Double = carprice - downpayment

            textViewLoan.text = "Carloan : Rm %.2f".format(loan)

            val interestrate:Double = editTextInterestRate.text.toString().toDouble()
            val loanperiod:Double = editTextLoanPeriod.text.toString().toDouble()

            val interes:Double = loan * interestrate * loanperiod

            textViewInterest.text = "Interes : RM %.2f".format(interes)

            val monthly:Double = (loan + interes)/loanperiod/12

            textViewMonthlyRepayment.text = "Monthly repayment: RM%.2f".format(monthly)



        }
    }


}
