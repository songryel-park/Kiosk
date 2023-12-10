package com.example.kiosc

import com.example.kiosc.domain.menu.Burger

fun main() {
    println("SHAKESHACK BURGER 에 오신걸 환영합니다.")
    println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")

    println("[ SHAKESHACK MENU ]")
    println("1. Burger         | 앵거스 비프 통살을 다져만든 버거")
    println("2. Forzen Custard | 매장에서 신선하게 만드는 아이스크림")
    println("3. Drink          | 매장에서 직접 만드는 음료")
    println("4. Beer           | 뉴욕 브루클린 브루어리에서 양조한 맥주")

    println("[ ORDER MENU ]")
    println("5. Order       | 장바구니를 확인 후 주문합니다.")
    println("6. Cancel      | 진행중인 주문을 취소합니다.")

    var num = readLine()!!.toInt()
    var menu = Mainmenu()

    println("${menu.order(num)}")

    println("주문이 완료되었습니다!")
    println("대기번호는 [1] 번 입니다.")
    println("(3초후 메뉴판으로 돌아갑니다.)")
}

class Mainmenu {
    fun order(pick:Int): String {

        var one = Burger()
//    var two = ForzenCustard()
//    var three = Drink()
//    var four = Beer()
//    var five = Order()
//    var six = Cancel()
        var result:String

        when(pick) {
            1-> result = (one.order1(pick.toString()))
            //2-> result = (two.order2(pick.toString()))
            //3-> result = (three.order3(pick.toString()))
            //4-> result = (four.order4(pick.toString()))
            //5-> result = (four.order5(pick.toString()))
            //6-> result = (four.order6(pick.toString()))
            else-> result = println("처음으로 돌아가기").toString()
        }
        return result
    }
}