package com.sh.numble.mybox.mapstruct;

import com.sh.numble.mybox.dto.FolderDto;
import com.sh.numble.mybox.entity.Folder;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(
    componentModel = "spring",
    unmappedTargetPolicy = ReportingPolicy.IGNORE,
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface FolderMapper extends GenericMapper<FolderDto, Folder> {
}
