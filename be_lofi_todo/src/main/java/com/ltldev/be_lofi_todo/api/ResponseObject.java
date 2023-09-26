package com.ltldev.be_lofi_todo.api;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ResponseObject {
    private String messenger;
    private String status;
    private Object data;
}
