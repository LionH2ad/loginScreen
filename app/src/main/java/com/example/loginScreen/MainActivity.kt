package com.example.loginScreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginScreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signInButton.setOnClickListener {
            // 입력된 텍스트를 trim()하여 앞뒤 공백 제거
            // etId.text.toString()을 호출하면 빈 Editable이 빈 문자열 ""로 변환됩니다.
            val idText = binding.idEditText.text.toString().trim()
            val passwordText = binding.passwordEditText.text.toString().trim()

            // let은 Kotlin에서 null이 아닌 값에 대해 어떤 작업을 수행하고 싶을 때 유용한 스코프 함수 입니다.
            // 연습을 위해 사용한 것이므로 if 문을 사용하여 빈 문자열 여부를 체크하는 방식으로 충분하며, let을 사용하지 않아도 됩니다.
            idText.let { id ->
                passwordText.let { password ->
                    // 아이디와 비밀번호가 모두 입력된 경우에만 로그인 처리
                    if (id == "" || password == "") {
                        // 여기에 실제 로그인 처리 로직을 작성할 수 있습니다.
                        // 예제에서는 로그인 성공 메시지를 출력합니다.
                        Toast.makeText(this, "아이디/비밀번호를 입력하세요", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this, "로그인 성공", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
}