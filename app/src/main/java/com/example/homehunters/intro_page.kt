package com.example.homehunters

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.homehunters.ui.theme.HomeHuntersTheme
import com.example.homehunters.ui.theme.myWhite
import com.example.homehunters.ui.theme.myblue
import kotlin.concurrent.thread

class intro_page : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      // enableEdgeToEdge()
        setContent {
           firstText()
        }
    }
}

@Composable
fun firstText(){
    Column (modifier = Modifier
        .fillMaxSize()
        .background(myWhite)
        .padding(start = 20.dp, top = 50.dp, end = 20.dp),
        horizontalAlignment = Alignment.Start
        ){

        Text(text = "PERFECT CHOICE FOR", fontSize = 30.sp, modifier = Modifier.padding(top = 30.dp))
        Text(text = "YOUR FUTURE", fontSize = 30.sp, modifier = Modifier.padding(top = 7.dp))
        Text(text = "Our properities for every client with lasting value", fontSize = 12.sp, modifier = Modifier.padding(top = 20.dp))

        Image(painter = painterResource(id = R.drawable.intro_pic), contentDescription = "",
            modifier = Modifier.padding(top = 30.dp) )


       Box(modifier = Modifier.fillMaxWidth(),
           contentAlignment = Alignment.CenterEnd ){
           Button(onClick = { /*TODO*/ },
               colors = ButtonDefaults.buttonColors(
                   containerColor = myblue
               ),
               modifier = Modifier.padding(top = 40.dp),
           ) {
               Text(text = "NEXT", color = myWhite)
           }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp),
            horizontalArrangement = Arrangement.Center) {
            Text(text = "Already have an account ?")
            Text(text = "Sign In", color = Color.Blue, modifier = Modifier.clickable {  }.padding(start = 5.dp, end = 5.dp))
        }
    }
}

@Preview( showSystemUi = true)
@Composable
private fun h() {
    firstText()

}
