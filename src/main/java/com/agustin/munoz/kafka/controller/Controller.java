package com.agustin.munoz.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.agustin.munoz.kafka.service.Producer;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/kafka")
public class Controller {

   private final Producer producer;

   @Autowired
   Controller(Producer producer) {
       this.producer = producer;
   }

   @PostMapping(value = "/publish")
   public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
       this.producer.sendMessage(message);
   }
}