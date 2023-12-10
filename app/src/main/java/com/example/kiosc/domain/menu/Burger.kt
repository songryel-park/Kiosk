package com.example.kiosc.domain.menu

import com.example.kiosc.domain.detail.detailBurger

open class Burger {
    fun order1(pick: String): String {
        println("SHAKESHACK BURGER 에 오신걸 환영합니다.")
        println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.")

        println("[ Burger MENU ]")
        println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
        println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
        println("3. ShroomBurger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
        println("4. CheeseBurger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
        println("5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거")

        var pick=readLine()!!.toInt()
        var detail = detailBurger()
        var result:String

        when(pick) {
            1-> result = (detail.menu1()).toString()
            2-> result = (detail.menu2()).toString()
            3-> result = (detail.menu3()).toString()
            4-> result = (detail.menu4()).toString()
            5-> result = (detail.menu5()).toString()
            else-> result = println("처음으로 돌아가기").toString()
        }
        return result
    }
}