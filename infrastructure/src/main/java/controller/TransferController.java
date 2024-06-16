package controller;

import dto.TransferRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/transfer")
public class TransferController {

    @PostMapping
    public ResponseEntity<Void> transfer(@RequestBody TransferRequest transferRequest) {
        System.out.println(transferRequest.toString());
        return ResponseEntity.ok().build();
    }

}
