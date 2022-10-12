
    //Above the Created At and the Updated at on the Models

    //Goes on the User
    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
	private List<Book> books;

    //Goes on the Book Model
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "user_id")
	private User user;