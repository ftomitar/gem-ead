package br.org.ccb.curso.conteudo;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import lombok.Data;

@Data
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = As.PROPERTY,
        property = "tipo"
)
@JsonSubTypes({
        @Type(value = Topico.class,    name = "Topico"),
        @Type(value = Avaliacao.class, name = "Avaliacao"),
        @Type(value = Texto.class,     name = "Texto"),
})
public abstract class Conteudo{
	
}

