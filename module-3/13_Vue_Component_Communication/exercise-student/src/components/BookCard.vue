<template>
  <div class="card" v-bind:class="{'read' : book.read}">
      <h3 class="book-title">{{book.title}}</h3>
      
    <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
    <h4 class="book-author">{{book.author}}</h4>
    <button @click="toggleReadStatus" v-bind:class="buttonClassReadOrUnread">{{readOrUnread}}</button>

  </div>
</template>

<script>
export default {
    props: ['book'],
    name: 'book-card',
    computed: {
        readOrUnread() {
            if (this.book.read) {
                return 'Mark Unread';
            } else {
                return 'Mark Read';
            }
        },
        buttonClassReadOrUnread() {
            if(this.book.read) {
                return 'mark-unread';
            } else {
                return 'mark-read';
            }
        }
    },
    methods: {
        toggleReadStatus() {
            this.$store.commit('TOGGLE_READ_UNREAD', this.book);
        }
    }
}
</script>

<style>
.card {
    border: 2px solid black;
    border-radius: 10px;
    width: 250px;
    height: 550px;
    margin: 20px;
}

.card.read {
    background-color: lightgray;
}

.card .book-title {
    font-size: 1.5rem;
}

.card .book-author {
    font-size: 1rem;
}

</style>