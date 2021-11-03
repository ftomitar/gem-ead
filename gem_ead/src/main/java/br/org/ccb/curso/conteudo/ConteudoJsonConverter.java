package br.org.ccb.curso.conteudo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;

@Configuration
public class ConteudoJsonConverter {

    @Bean("ConteudoJsonConverterToMongoCustomConversions")
    public MongoCustomConversions conteudoJsonConverter()
    {
    	List<Converter<?, ?>> converters = new ArrayList<>();
    	converters.add((Converter<?, ?>) new ConteudoConverter());
    	return new MongoCustomConversions(converters);
    }
}
