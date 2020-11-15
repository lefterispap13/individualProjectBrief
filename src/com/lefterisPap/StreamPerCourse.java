package com.lefterisPap;

public class StreamPerCourse {
    private Course title;
    private Stream stream;

    public StreamPerCourse(Course title,Stream stream){
        this.title=title;
        this.stream=stream;
    }
    public Course getTitle(){
        return title;
    }

    public Stream getStream() {
        return stream;
    }

    public void setStream(Stream newStream) {
        this.stream = newStream;
    }

    public void setTitle(Course newTitle) {
        this.title = newTitle;
    }

}

