using System;
using System.IO;
using System.Text.Json;

namespace TextEditor
{
    public class FilePersistence
    {
        public static void SaveToFile(EditorMemento memento, string filePath)
        {
            string json = JsonSerializer.Serialize(memento);
            File.WriteAllText(filePath, json);
        }

        public static EditorMemento LoadFromFile(string filePath)
        {
            if (!File.Exists(filePath))
                throw new FileNotFoundException("File not found.");

            string json = File.ReadAllText(filePath);
            return JsonSerializer.Deserialize<EditorMemento>(json);
        }
    }
}