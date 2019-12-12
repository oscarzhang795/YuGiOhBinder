package com.oscarz.yu_gi_ohbinder

import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class TCGAPIConnector: WebService {

    val url = "https://api.tcgplayer.com/token"
    val queue = Volley.newRequestQueue(BinderApplication.appContext)
    fun getAuthToken() {
        val request = object: StringRequest(
            Method.POST, url,
            Response.Listener {

            },
            Response.ErrorListener {

            }
        ) {
            override fun getParams(): MutableMap<String, String> {
                val map = HashMap<String, String>()
                map["grant_type"] = "client_credentials"
                map["client_id"] = BuildConfig.PUBLIC_ID
                map["client_secret"] = BuildConfig.PRIVATE_ID
                return map
            }
        }
        queue.add(request)
    }
}