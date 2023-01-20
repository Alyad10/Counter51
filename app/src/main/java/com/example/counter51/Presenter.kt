package com.example.counter51

class Presenter {
    private val model = Model()
    lateinit var view: View
    fun increment(){
        model.increment()
        view.changeCount(model.count)

    }
    fun showT(){
        if (model.count ==10){
            view.showToast()
        }

    }
    fun changeColor(){
        if (model.count ==15){
            view.changeColor()
        }
    }
    fun  attachView(view: View){
        this.view = view

    }
}