package com.erroratline0.cornel.infininotes;

import androidx.core.content.FileProvider;

public class InfiniPaintFileProvider extends FileProvider {
    public InfiniPaintFileProvider() {
        super(R.xml.file_paths);
    }
}
