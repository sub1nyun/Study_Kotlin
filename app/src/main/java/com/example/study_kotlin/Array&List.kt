package com.example.study_kotlin

//Array and List

//Array -> (정해져 있는 사이즈가 있음) 메모리가 할당이 되어서 나옴

//List -> 두가지로 나뉨
//1. List -> 수정이 불가 (Read-Only) 데이터가 변경될 일이 없다면 List 사용이 권장되는듯 함
//2. MutableList(읽기와 쓰기가 가능) -> 수정이 가능함

fun main () {
    array()
}

fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    //꼭 Int타입이 아니여도 가능함 (Any타입으로 추론함)
    val array2 : Array<Any> = arrayOf(1,"a",3.4f)
    val list2 : List<Any> = listOf(1,"d",11L)


    //기본적으로 Array는 Mutable임 -> 값을 변경하는것이 가능함 (사이즈를 변경하지 않는다면)
    //index 0번을 3으로 바꾼다(가능)
    array[0] = 3
    array.set(0,2)
    println(array[0])

    //List -> 값을 변경 못하는 '일기 전용'
    //list[0] = 2 -> 오류 발생
    //list는 array와 다르게 '인터페이스임'
    //값을 가져와서 담는것은 가능함 -> 직접적으로 들어가서 값을 바꾸는것은 불가능함
    var result = list.get(0)

    val arrayList = arrayListOf<Int>() //주소 값이 바뀌지 않기 때문에 val을 사용해도 무방
    arrayList.add(10)
    arrayList.add(20)
    //ex 철수 집 주소 영희 집 주소
    //해당 집 가족 구성원들은 나갔다 들어오더라도 주소는 변하지 않음

    //arrayList = arrayListOf() //val로 선언하면 다시 할당될 수 없다는 오류가 발생함

    //자바 컬렉션
    //1. List - 순서가 있는 데이터의 집합, 중복을 허용함
    //2. Set - 집합적(순서가 없음), 중복 허용 X null도 하나만 됨
    //3. map - key와 value를 쌍으로 갖는 집합구조 순서 유지 x 키는 중복 x 값은 중복 o

    //ArrayList -> 저장 용량이 자동으로 늘어남(기본 생성자시 10개) -> 처음부터 크게 선언 가능
    //Object 타입으로 변환되어 모든 객체 저장이 가능함
    //저장, 조회할때 object로 변환해서 사용하는  단점이 있음(느림)




}