<template>
  <form class="new-book-form">
  <div>
      <label for="title">Title:</label>
    <input type="text" class="title-input" name="title" id="title"
    v-model="book.title"/>
  </div>
  <div>
      <label for="author">Author:</label>
      <input type="text" class="author-input" name="author" id="author"
      v-model="book.author">
  </div>
  <div>
      <label for="isbn">ISBN:</label>
      <input type="number" class="isbn-input" name="isbn" id="isbn"
      v-model="book.isbn">
  </div>
  <input type="submit" @click.prevent="submitForm">
  </form>
</template>

<script>
export default {
  name: "new-book-form",
  data() {
      return {
          book: {
              read: false
          }
      }
  },
  methods: {
      submitForm() {
          this.$store.commit('ADD_NEW_BOOK', this.book);
      }
  }
};
</script>

<style>
</style>