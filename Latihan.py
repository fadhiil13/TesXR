import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

data = pd.read_csv('nilai_siswa.csv')

data.info()
data.head()
data.describe()
# print("Rata-rata",data['Nilai'].mean())
# print("Median",data['Nilai'].median)
# print("Modus:", data['Nilai'].mode()[0])

matematika = data[data['Matpel'] == 'Matematika']
# print(matematika)

Ingris = data[data['Matpel'] == 'Bahasa Inggris']
# print(Ingris)

data.groupby('Matpel')['Nilai'].agg(['max','min'])
rata = data.groupby('Matpel')['Nilai'].mean()
rata.plot(kind='bar', color='red')
plt.title('Rata-Rata Nilai per Matpel')
plt.xlabel('Mata Pelajaran')
plt.ylabel('Nilai Rata-Rata')
plt.show()

sns.boxplot(x='Mapel', y='Nilai', data=data)
plt.title('Sebaran Nilai per Mata Pelajaran')
plt.show()