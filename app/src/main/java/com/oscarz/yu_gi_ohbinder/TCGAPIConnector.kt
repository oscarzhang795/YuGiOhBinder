package com.oscarz.yu_gi_ohbinder

import android.os.Build
import android.util.Log
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

class TCGAPIConnector: WebService {

    val url = "https://api.tcgplayer.com/token/grant_type=client_credentials&client_id=PUBLIC_KEY&client_secret=PRIVATE_KEY"
    val queue = Volley.newRequestQueue(BinderApplication.appContext)
    fun getAuthToken() {
        val jsonBody = JSONObject()
        jsonBody.put("grant_type", "client_credentials")
        jsonBody.put("client_id", BuildConfig.PUBLIC_ID)
        jsonBody.put("client_secret", BuildConfig.PRIVATE_ID)

        val request = StringRequest(Request.Method.POST, url,
            Response.Listener {

            },
            Response.ErrorListener {

            }
        )
        queue.add(request)
    }
}