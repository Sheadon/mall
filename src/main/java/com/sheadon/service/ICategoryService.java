package com.sheadon.service;

import com.sheadon.common.ServerResponse;

public interface ICategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);
}
