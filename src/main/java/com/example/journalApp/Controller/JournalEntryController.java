package com.example.journalApp.Controller;

import com.example.journalApp.Entity.JournalEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    private Map<Long, JournalEntity> journalData = new HashMap<>();

    @GetMapping("/home")
    public List<JournalEntity> getAll(){
        return new ArrayList<>(journalData.values());
    }

    @PostMapping
    public  boolean createEntry(@RequestBody JournalEntity createData){
        journalData.put(createData.getId(),createData);
        return true;
    }

}
