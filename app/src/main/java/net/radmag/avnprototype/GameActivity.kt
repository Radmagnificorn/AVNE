package net.radmag.avnprototype

import android.app.Activity
import android.content.pm.ActivityInfo
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import net.radmag.avnprototype.data.Scene

class GameActivity : GameContract.View, Activity(){
    override fun populateScene(scene: Scene) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_game)
    }
}
