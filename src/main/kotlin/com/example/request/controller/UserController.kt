package com.example.request.controller

import com.example.request.model.User
import jakarta.websocket.server.PathParam
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController {
   /* @GetMapping("{/id}")
    fun user(@PathVariable ("id") id:Int ): String {
        return "user hello"

    }*/
   /* @GetMapping()
    fun user(@PathParam  ("id") id: Int): String {
        return "user hello $id"
    }*/

    @GetMapping()
    fun user(@RequestBody user: User): String {
        return "user hello ${user.name} ${user.age} ${user.id}"
    }
}




