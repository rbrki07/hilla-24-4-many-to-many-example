package com.example.application.services;

import com.example.application.entities.Item;
import com.example.application.repositories.ItemRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.CrudRepositoryService;

@BrowserCallable
@AnonymousAllowed
public class ItemService extends CrudRepositoryService<Item, Long, ItemRepository> {
    
}
