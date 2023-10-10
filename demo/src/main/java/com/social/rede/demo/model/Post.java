package com.social.rede.demo.model;

import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@RedisHash("posts")
public class Post implements Serializable {

    private static final long serialVersionUID = -6550087036434141495L;
    private String id;
    private String mensagem;
    private String respostas;
    private Boolean ehPrivado;

}