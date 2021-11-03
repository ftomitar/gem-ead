package br.org.ccb.curso.conteudo;

import org.bson.Document;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@ReadingConverter
public class ConteudoConverter implements Converter<Document, Conteudo> {

	public Conteudo convert(Document source) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		Conteudo conteudo = null;
		try {
			conteudo = mapper.readValue(source.toJson(), Conteudo.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return conteudo;
	}
}
