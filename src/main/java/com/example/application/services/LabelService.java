package com.example.application.services;

import java.util.List;

import com.example.application.entities.Label;
import com.example.application.repositories.LabelRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.CrudRepositoryService;

@BrowserCallable
@AnonymousAllowed
public class LabelService extends CrudRepositoryService<Label, Long, LabelRepository> {
    
    public List<Label> getLabels() {
        return super.getRepository().findAll();
    }
}
