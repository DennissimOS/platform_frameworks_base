/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.telephony.mbms;

import android.os.RemoteException;
import android.telephony.MbmsDownloadManager;

import java.util.List;

/**
 * A callback class that apps should use to receive information on file downloads over
 * cell-broadcast.
 * @hide
 */
public class MbmsDownloadManagerCallback extends IMbmsDownloadManagerCallback.Stub {

    /**
     * Indicates that the middleware has encountered an asynchronous error.
     * @param errorCode Any error code listed in {@link MbmsException}
     * @param message A message, intended for debugging purposes, describing the error in further
     *                detail.
     * @throws RemoteException
     */
    @Override
    public void error(int errorCode, String message) throws RemoteException {
        // default implementation empty
    }

    /**
     * Called to indicate published File Services have changed.
     *
     * This will only be called after the application has requested a list of file services and
     * specified a service class list of interest via
     * {@link MbmsDownloadManager#getFileServices(List)}. If there are subsequent calls to
     * {@link MbmsDownloadManager#getFileServices(List)}, this method may not be called again if
     * the list of service classes would remain the same.
     *
     * @param services The most recently updated list of available file services.
     */
    @Override
    public void fileServicesUpdated(List<FileServiceInfo> services) throws RemoteException {
        // default implementation empty
    }

    /**
     * Called to indicate that the middleware has been initialized and is ready.
     *
     * Before this method is called, calling any method on an instance of
     * {@link android.telephony.MbmsDownloadManager} will result in an {@link MbmsException}
     * being thrown with error code {@link MbmsException#ERROR_MIDDLEWARE_NOT_BOUND}
     * or {@link MbmsException.GeneralErrors#ERROR_MIDDLEWARE_NOT_YET_READY}
     */
    @Override
    public void middlewareReady() throws RemoteException {
        // default implementation empty
    }
}
