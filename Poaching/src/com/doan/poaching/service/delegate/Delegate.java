package com.doan.poaching.service.delegate;

import com.doan.poaching.service.response.CoreResponse;

public interface Delegate {

	public void success(CoreResponse response, boolean isSuccess);
}
