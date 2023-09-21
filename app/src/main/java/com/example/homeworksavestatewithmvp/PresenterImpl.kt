package com.example.homeworksavestatewithmvp

import Presenter

class PresenterImpl:Presenter {
    private var myView:View? = null
    private var model:Model = ModelImpl

    override fun addNumberOfClicks() {
        model.addNumberOfClicks()
        myView?.updateNumberOfClicks(model.getNumberOfClicks())
    }

    override fun setView(view: View) {
        myView = view
        view.updateNumberOfClicks(model.getNumberOfClicks())
    }
}
