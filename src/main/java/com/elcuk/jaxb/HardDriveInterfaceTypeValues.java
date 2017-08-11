/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlEnum;
/*     */ import javax.xml.bind.annotation.XmlEnumValue;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ @XmlType(name="HardDriveInterfaceTypeValues")
/*     */ @XmlEnum
/*     */ public enum HardDriveInterfaceTypeValues
/*     */ {
/*  85 */   ATA("ata"), 
/*     */ 
/*  87 */   ATA_100("ata100"), 
/*     */ 
/*  89 */   ATA_133("ata133"), 
/*     */ 
/*  91 */   ATA_2("ata_2"), 
/*     */ 
/*  93 */   ATA_3("ata_3"), 
/*     */ 
/*  95 */   ATA_4("ata_4"), 
/*     */ 
/*  97 */   ATA_5("ata_5"), 
/*     */ 
/*  99 */   ATAPI("atapi"), 
/*     */ 
/* 101 */   DMA("dma"), 
/*     */ 
/* 103 */   EIDE("eide"), 
/*     */ 
/* 105 */   EIO("eio"), 
/*     */ 
/* 107 */   ESATA("esata"), 
/*     */ 
/* 109 */   ESDI("esdi"), 
/*     */ 
/* 111 */   ETHERNET("ethernet"), 
/*     */ 
/* 113 */   ETHERNET_100_BASE_T("ethernet_100base_t"), 
/*     */ 
/* 115 */   ETHERNET_100_BASE_TX("ethernet_100base_tx"), 
/*     */ 
/* 117 */   ETHERNET_10_100_1000("ethernet_10_100_1000"), 
/*     */ 
/* 119 */   ETHERNET_10_BASE_T("ethernet_10base_t"), 
/*     */ 
/* 121 */   FAST_SCSI("fast_scsi"), 
/*     */ 
/* 123 */   FAST_WIDE_SCSI("fast_wide_scsi"), 
/*     */ 
/* 125 */   FATA("fata"), 
/*     */ 
/* 127 */   FC_AL("fc_al"), 
/*     */ 
/* 129 */   FC_AL_2("fc_al_2"), 
/*     */ 
/* 131 */   FDD("fdd"), 
/*     */ 
/* 133 */   FIBRE_CHANNEL("fibre_channel"), 
/*     */ 
/* 135 */   FIREWIRE("firewire"), 
/*     */ 
/* 137 */   IDE("ide"), 
/*     */ 
/* 139 */   IEEE_1284("ieee_1284"), 
/*     */ 
/* 141 */   IEEE_1394_B("ieee_1394b"), 
/*     */ 
/* 143 */   ISCSI("iscsi"), 
/*     */ 
/* 145 */   LVDS("lvds"), 
/*     */ 
/* 147 */   PC_CARD("pc_card"), 
/*     */ 
/* 149 */   PCI_EXPRESS_X_16("pci_express_x16"), 
/*     */ 
/* 151 */   PCI_EXPRESS_X_4("pci_express_x4"), 
/*     */ 
/* 153 */   PCI_EXPRESS_X_8("pci_express_x8"), 
/*     */ 
/* 155 */   RAID("raid"), 
/*     */ 
/* 157 */   SCSI("scsi"), 
/*     */ 
/* 159 */   SERIAL_ATA("serial_ata"), 
/*     */ 
/* 161 */   SERIAL_ATA_150("serial_ata150"), 
/*     */ 
/* 163 */   SERIAL_ATA_300("serial_ata300"), 
/*     */ 
/* 165 */   SERIAL_ATA_600("serial_ata600"), 
/*     */ 
/* 167 */   SERIAL_SCSI("serial_scsi"), 
/*     */ 
/* 169 */   SOLID_STATE("solid_state"), 
/*     */ 
/* 171 */   SSA("ssa"), 
/*     */ 
/* 173 */   ST_412("st412"), 
/*     */ 
/* 175 */   ULTRA_2_SCSI("ultra2_scsi"), 
/*     */ 
/* 177 */   ULTRA_2_WIDE_SCSI("ultra2_wide_scsi"), 
/*     */ 
/* 179 */   ULTRA_3_SCSI("ultra3_scsi"), 
/*     */ 
/* 181 */   ULTRA_160_SCSI("ultra_160_scsi"), 
/*     */ 
/* 183 */   ULTRA_320_SCSI("ultra_320_scsi"), 
/*     */ 
/* 185 */   ULTRA_ATA("ultra_ata"), 
/*     */ 
/* 187 */   ULTRA_SCSI("ultra_scsi"), 
/*     */ 
/* 189 */   ULTRA_WIDE_SCSI("ultra_wide_scsi"), 
/*     */ 
/* 191 */   UNKNOWN("unknown"), 
/*     */ 
/* 193 */   USB("usb"), 
/*     */ 
/* 195 */   USB_1_1("usb_1.1"), 
/*     */ 
/* 197 */   USB_2_0("usb_2.0"), 
/*     */ 
/* 199 */   USB_2_0_3_0("usb_2.0_3.0"), 
/*     */ 
/* 201 */   USB_3_0("usb_3.0");
/*     */ 
/*     */   private final String value;
/*     */ 
/*     */   private HardDriveInterfaceTypeValues(String v) {
/* 206 */     this.value = v;
/*     */   }
/*     */ 
/*     */   public String value() {
/* 210 */     return this.value;
/*     */   }
/*     */ 
/*     */   public static HardDriveInterfaceTypeValues fromValue(String v) {
/* 214 */     for (HardDriveInterfaceTypeValues c : values()) {
/* 215 */       if (c.value.equals(v)) {
/* 216 */         return c;
/*     */       }
/*     */     }
/* 219 */     throw new IllegalArgumentException(v);
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.HardDriveInterfaceTypeValues
 * JD-Core Version:    0.6.2
 */