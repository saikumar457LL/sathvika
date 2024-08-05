package org.ocean.saikumar;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MyRestController {


    private final TreeRepository treeRepository;

    @GetMapping("/trees")
    public List<Tree> someList(){
        return treeRepository.findAll();
    }
}
