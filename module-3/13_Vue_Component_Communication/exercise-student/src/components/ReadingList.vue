<template>
  <div class="book-container">
  <book-card v-for="currentBook in $store.state.books" v-bind:key="currentBook.id" v-bind:book="currentBook"></book-card>
  </div>
</template>

<script>
import BookCard from './BookCard.vue'
export default {
    name: 'reading-list',
    components: {
      BookCard
    },
}
</script>

<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>