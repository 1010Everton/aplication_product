package com.example.demo.Acesso_Ao_Banco;
import com.example.demo.produtos.Data_do_calendario;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class DataDoCalendarioConverter implements AttributeConverter<Data_do_calendario, String> {

    @Override
    public String convertToDatabaseColumn(Data_do_calendario attribute) {
        return attribute == null ? null : attribute.toString();
    }

    @Override
    public Data_do_calendario convertToEntityAttribute(String dbData) {
        if (dbData == null || dbData.isEmpty()) {
            return null;
        }
        String[] parts = dbData.split("/");
        int dia = Integer.parseInt(parts[0]);
        int mes = Integer.parseInt(parts[1]);
        int ano = Integer.parseInt(parts[2]);
        return new Data_do_calendario(dia, mes, ano);
    }
}
