package com.InternationalAssociationVolunteers.BackendVolunteers.entity.Enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ActivityState {
    start(1),
    process(2),
    finished(3);
    private  final  Integer id;
    ActivityState(int id) {
        this.id = id;
    }


}
