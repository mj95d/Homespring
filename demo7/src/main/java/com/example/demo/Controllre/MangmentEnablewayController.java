package com.example.demo.Controllre;

import com.example.demo.Model.MangmentEmployee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/MangmentEnableway")
public class MangmentEnablewayController {

    ArrayList<MangmentEmployee> mangmentEmployees = new ArrayList();

    @GetMapping("/getAll")
    public String getAll(){
        return mangmentEmployees.toString();
    }


    @PostMapping("/add")
    public String add(@RequestBody MangmentEmployee mangmentEmployee){
        mangmentEmployees.add(mangmentEmployee);
        return "Success";
    }

}
