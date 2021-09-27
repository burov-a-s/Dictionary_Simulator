package ru.burov.Dictionary_Simulator.entity;

import javax.persistence.*;

@Entity
@Table(name = "words")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "english_word")
    private String englishWord;

    @Column(name = "russian_word")
    private String russianWord;

    @Column(name = "number_of_attempts")
    private int numberOfAttempts;

    @Column(name = "number_of_correct_attempts")
    private int numberOfCorrectAttempts;

    public Word() {
    }

    public Word(String englishWord, String russianWord, int numberOfAttempts, int numberOfCorrectAttempts) {
        this.englishWord = englishWord;
        this.russianWord = russianWord;
        this.numberOfAttempts = numberOfAttempts;
        this.numberOfCorrectAttempts = numberOfCorrectAttempts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getRussianWord() {
        return russianWord;
    }

    public void setRussianWord(String russianWord) {
        this.russianWord = russianWord;
    }

    public int getNumberOfAttempts() {
        return numberOfAttempts;
    }

    public void setNumberOfAttempts(int numberOfAttempts) {
        this.numberOfAttempts = numberOfAttempts;
    }

    public int getNumberOfCorrectAttempts() {
        return numberOfCorrectAttempts;
    }

    public void setNumberOfCorrectAttempts(int numberOfCorrectAttempts) {
        this.numberOfCorrectAttempts = numberOfCorrectAttempts;
    }

    @Override
    public String toString() {
        return "Word{" +
                "id=" + id +
                ", englishWord='" + englishWord + '\'' +
                ", russianWord='" + russianWord + '\'' +
                ", numberOfAttempts=" + numberOfAttempts +
                ", numberOfCorrectAttempts=" + numberOfCorrectAttempts +
                '}';
    }
}
