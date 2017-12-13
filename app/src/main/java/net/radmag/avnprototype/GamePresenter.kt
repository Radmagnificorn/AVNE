package net.radmag.avnprototype

import net.radmag.avnprototype.data.Scene

/**
 * Created by Stephen on 11/22/2017.
 */
class GamePresenter(view: GameContract.View) : GameContract.Presenter {
    val view = view
    override fun loadScene() {
        view.populateScene(Scene())
    }
}