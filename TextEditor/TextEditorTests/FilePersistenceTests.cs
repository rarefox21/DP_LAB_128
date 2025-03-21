using Xunit;
using System.IO;
using TextEditor;

namespace TextEditorTests
{
    public class FilePersistenceTests
    {
        [Fact]
        public void SaveAndLoadState_ShouldPreserveEditorState()
        {
            var editor = new TextEditor.TextEditor();
            editor.SetContent("Hello File");

            string filePath = "test_save.json";
            FilePersistence.SaveToFile(editor.CreateMemento(), filePath);

            var loadedMemento = FilePersistence.LoadFromFile(filePath);
            Assert.Equal("Hello File", loadedMemento.Content);

            File.Delete(filePath);
        }

        [Fact]
        public void LoadFromFile_NonExistentFile_ShouldThrowException()
        {
            string filePath = "non_existent.json";
            Assert.Throws<FileNotFoundException>(() => FilePersistence.LoadFromFile(filePath));
        }
    }
}