package com.example.ads

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
lateinit var mInterstitialAd :InterstitialAd
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this,"ca-app-pub-3940256099942544~3347511713")
        val adView =findViewById<AdView>(R.id.adView)
        val adrequest=AdRequest.Builder().build()
        adView.loadAd(adrequest)


        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-3940256099942544/1033173712"
        mInterstitialAd.loadAd(AdRequest.Builder().build())
        btnads.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                mInterstitialAd.show()
            }
        })
    }
}
