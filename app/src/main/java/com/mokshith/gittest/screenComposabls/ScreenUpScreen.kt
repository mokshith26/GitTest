package com.mokshith.gittest.screenComposabls

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.mokshith.gittest.R
import com.mokshith.gittest.composableComponents.BoldTextComponents
import com.mokshith.gittest.composableComponents.ButtonComponent
import com.mokshith.gittest.composableComponents.CheckBoxComponent
import com.mokshith.gittest.composableComponents.ClickableTextComponentSingUpLogin
import com.mokshith.gittest.composableComponents.DividerComponent
import com.mokshith.gittest.composableComponents.NormalTextComponents
import com.mokshith.gittest.composableComponents.SimpleOutlinedTextFieldSample
import com.mokshith.gittest.composableComponents.SimpleOutlinedTextFieldSamplePassword
import com.mokshith.gittest.navigation.Screen

@Composable
fun SignUpScreen(navController : NavController) {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(28.dp)) {
            NormalTextComponents(value = stringResource(id = R.string.hello))
            BoldTextComponents(value = "Create an Account")
            Spacer(modifier = Modifier.heightIn(24.dp))
            SimpleOutlinedTextFieldSample(
                value = "First Name",
                KeyboardOptions(keyboardType = KeyboardType.Text),
                Icons.Rounded.Person
            )
            SimpleOutlinedTextFieldSample(
                value = "Last Name",
                KeyboardOptions(keyboardType = KeyboardType.Text),
                Icons.Rounded.Person
            )
            SimpleOutlinedTextFieldSample(
                value = "Email",
                KeyboardOptions(keyboardType = KeyboardType.Email),
                Icons.Rounded.Email
            )
            //password outlined text
            SimpleOutlinedTextFieldSamplePassword(
                value = "Password",
                imageIcon = Icons.Rounded.Lock
            )
            CheckBoxComponent(navController = navController, onItemClick = {
                navController.navigate(Screen.PrivacyPolicy.route)
            })

            Spacer(modifier = Modifier.heightIn(80.dp))

            ButtonComponent(value = "Register")

            Spacer(modifier = Modifier.heightIn(20.dp))

            DividerComponent()

            ClickableTextComponentSingUpLogin(
                navController = navController,
                initialText = "Already have an account? ",
                finalText = "Login",
                onItemClick = {

                }
            )
        }
    }
}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen() {
    SignUpScreen(navController = rememberNavController())
}

