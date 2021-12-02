package com.pans.jetpack.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pans.jetpack.data.Message
import com.pans.jetpack.R
import com.pans.jetpack.ui.theme.JetpackDemoTheme

/**
 * Create by panchenhuan on 2021/11/30
 * walkwindc8@foxmail.com
 * Description:
 */


@Composable
fun MessageCard(msg: Message) {
    Row(
        modifier = Modifier
            .padding(8.dp)
            .width(intrinsicSize = IntrinsicSize.Max)
            .background(MaterialTheme.colors.background),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.ava),
            contentDescription = "launcher",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )
        Column {
            Text(
                text = "Name:${msg.from}"
            )
            Text(
                text = "Content:${msg.content}"
            )
        }
    }

}

@Preview
@Composable
fun PreviewMessageCard() {
    JetpackDemoTheme(true) {
        MessageCard(Message("nap", "hola"))
    }
}


@Composable
fun Conversation(messages:List<Message>){
    LazyColumn(content = {
//        items(messages){m->
//            MessageCard(m)
//        }
        items(100){i->
            MessageCard(Message("nap","content$i"))
        }
    })
}