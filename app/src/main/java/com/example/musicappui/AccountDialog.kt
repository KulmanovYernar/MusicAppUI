package com.example.musicappui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.AlertDialog
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.primarySurface
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties

@Composable
fun AccountDialog(isDialogOpen: MutableState<Boolean>) {
    if (isDialogOpen.value) {
        AlertDialog(
            onDismissRequest = {
                isDialogOpen.value = false
            },
            confirmButton = {
                TextButton(onClick = { isDialogOpen.value = false }) {
                    Text(text = "Confirm")
                }
            },
            dismissButton = {
                TextButton(onClick = { isDialogOpen.value = false }) {
                    Text(text = "Dismiss")
                }
            },
            title = {
                Text(text = "")
            },
            text = {
                Column(
                    modifier = Modifier
                        .wrapContentHeight()
                        .padding(top = 16.dp)
                ) {
                    TextField(
                        value = "", onValueChange = {

                        },
                        label = {
                            Text(text = "Email")
                        },
                        modifier = Modifier.padding(top = 16.dp)
                    )

                    TextField(
                        value = "", onValueChange = {

                        },
                        label = {
                            Text(text = "Password")
                        },
                        modifier = Modifier.padding(top = 8.dp)
                    )
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.primarySurface)
                .padding(8.dp),
            shape = RoundedCornerShape(8.dp),
            backgroundColor = Color.White,
            properties = DialogProperties(
                dismissOnClickOutside = true,
                dismissOnBackPress = true
            )
        )
    }
}